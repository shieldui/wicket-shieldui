package com.shieldui.wicket.autocomplete;

import com.shieldui.wicket.WidgetComponentBase;

public class AutoComplete extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final AutoCompleteOptions options = new AutoCompleteOptions();
    
    public AutoComplete(String id)
    {
        super(id, "AutoComplete");
    }

    @Override
    public AutoCompleteOptions getOptions()
    {
        return options;
    }
}
