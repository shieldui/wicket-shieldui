package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.grid.Grid;
import com.shieldui.wicket.grid.GridOptions;
import com.shieldui.wicket.grid.events.ColumnReorderEventListener;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JSONFunction;
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
        grid1.getOptions().setDataSource(new DataSourceOptions()
                .setData(new JSONFunction("gridData"))
                .setGroup(new DataSourceOptions.GroupOption().setField("gender").setOrder(DataSourceOptions.Order.ASC))
        );
        grid1.getOptions().getPaging().setPageSize(12).setPageLinksCount(10);
        grid1.getOptions().setAltRows(false);
        grid1.getOptions().setColumns(
                new GridOptions.ColumnOption().setField("name").setHeaderTemplate(new JSONFunction("$('template1').html()")),
                new GridOptions.ColumnOption().setField("phone").setHeaderTemplate(new JSONFunction("$('template2').html()")),
                new GridOptions.ColumnOption().setField("email").setHeaderTemplate(new JSONFunction("$('template3').html()"))
        );
        grid1.getOptions().setColumnReorder(true);
        grid1.getOptions().setResizing(true);
        
        // export to excel and pdf options
        grid1.getOptions().addToolbar(
                new GridOptions.ToolbarOptions()
                    .addButton(
                            new GridOptions.ToolbarButtonOption()
                                    .setCommandName(GridOptions.ToolbarButtonCommand.EXCEL)
                                    .setCaption("Export to Excel")
                                
                    )
                    .addButton(
                            new GridOptions.ToolbarButtonOption()
                                    .setCommandName(GridOptions.ToolbarButtonCommand.PDF)
                                    .setCaption("Export to PDF")
                                
                    )
        );
        grid1.getOptions().getExportOptions().getExcel()
                .setDataSource(new DataSourceOptions().setData(new JSONFunction("gridData")))
                .setReadDataSource(true)
                .setAuthor("Shield UI Demo Author")
                .setColumnFields("name", "email");
        grid1.getOptions().getExportOptions().getPdf()
                .setDataSource(new DataSourceOptions().setData(new JSONFunction("gridData")))
                .setReadDataSource(true)
                .setAuthor("Shield UI Demo Author")
                .setSize(GridOptions.PDFPageSize.A3)
                .setOrientation(GridOptions.PDFPageOrientation.LANDSCAPE)
                .setColumnFields("name", "email");
                
        // add server-side column reorder event handler
        grid1.add(new ColumnReorderEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                HashMap<String, Object> args = (HashMap<String, Object>) event;
                System.out.println("Reordering column " + args.get("index") + " to " + args.get("newIndex"));
            }
        });
    }
}
