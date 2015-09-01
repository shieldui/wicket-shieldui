package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.grid.Grid;
import com.shieldui.wicket.grid.GridOptions;
import com.shieldui.wicket.grid.events.ColumnReorderEventListener;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JsonFunction;
import org.apache.wicket.markup.html.WebPage;

public class GridDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public GridDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        Grid grid1 = new Grid("grid1");
        add(grid1);
        
        // setup some grid options
        grid1.getOptions().setDataSource(new DataSourceOptions().setData(new JsonFunction("gridData")));
        grid1.getOptions().getPaging().setPageSize(12).setPageLinksCount(10);
        grid1.getOptions().setAltRows(false);
        grid1.getOptions().setColumns(
                new GridOptions.ColumnOption().setField("name").setHeaderTemplate(new JsonFunction("$('template1').html()")),
                new GridOptions.ColumnOption().setField("phone").setHeaderTemplate(new JsonFunction("$('template2').html()")),
                new GridOptions.ColumnOption().setField("email").setHeaderTemplate(new JsonFunction("$('template3').html()"))
        );
        grid1.getOptions().setColumnReorder(true);
        grid1.getOptions().setResizing(true);
        
        
        grid1.add(new ColumnReorderEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                HashMap<String, Object> args = (HashMap<String, Object>) event;
                System.out.println("Reordering column " + args.get("index") + " to " + args.get("newIndex"));
            }
        });
    }
}
