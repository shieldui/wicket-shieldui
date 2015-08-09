package com.shieldui.wicket.barcode;

import com.shieldui.wicket.WidgetComponentBase;

public class Barcode extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;

    private final BarcodeOptions options = new BarcodeOptions();
    
    public Barcode(String id)
    {
        super(id, "Barcode");
    }
    
    @Override
    public BarcodeOptions getOptions()
    {
        return options;
    }
}
