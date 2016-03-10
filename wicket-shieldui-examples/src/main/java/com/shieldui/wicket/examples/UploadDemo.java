package com.shieldui.wicket.examples;

import com.shieldui.wicket.upload.Upload;
import com.shieldui.wicket.upload.UploadOptions;
import org.apache.wicket.markup.html.WebPage;

public class UploadDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public UploadDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        Upload files = new Upload("files");
        add(files);
        
        files.getOptions()
                .setAsync(new UploadOptions.AsyncOptions()
                        .setEnabled(true)
                        .setSave(new UploadOptions.SaveOptions().setUrl("/upload/save"))
                        .setRemove(new UploadOptions.RemoveOptions().setUrl("/upload/remove")));
    }
}
