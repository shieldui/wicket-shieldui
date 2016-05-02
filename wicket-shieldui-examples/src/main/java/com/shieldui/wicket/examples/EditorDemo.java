package com.shieldui.wicket.examples;

import com.shieldui.wicket.editor.Editor;
import com.shieldui.wicket.editor.ExecuteEventListener;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;

public class EditorDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public EditorDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        Editor editor = new Editor("editor");
        add(editor);
        
        editor.getOptions()
                .setHeight(400)
                .setCommands(
                    "formatBlock",
                    "removeFormat",
                    "fontName",
                    "fontSize",
                    "foreColor",
                    "backColor",
                    "bold",
                    "italic",
                    "underline",
                    "strikeThrough",
                    "subscript",
                    "superscript",
                    "justifyLeft",
                    "justifyCenter",
                    "justifyRight",
                    "justifyFull",
                    "insertUnorderedList",
                    "insertOrderedList",
                    "indent",
                    "outdent",
                    "createLink",
                    "unlink",
                    "insertImage",
                    "viewHtml"
                );
        
        add(new ExecuteEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.out.println(event);
            }
        });
    }
}
