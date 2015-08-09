package com.shieldui.wicket.tagcloud;

import com.shieldui.wicket.WidgetComponentBase;

public class TagCloud extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final TagCloudOptions options = new TagCloudOptions();
    
    public TagCloud(String id)
    {
        super(id, "TagCloud");
    }
    
    @Override
    public TagCloudOptions getOptions()
    {
        return options;
    }
}
