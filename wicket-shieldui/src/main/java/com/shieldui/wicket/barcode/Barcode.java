package com.shieldui.wicket.barcode;

import com.shieldui.wicket.WidgetBase;

public class Barcode extends WidgetBase
{
    private static final long serialVersionUID = 1L;

    private final BarcodeOptions options = new BarcodeOptions();
    
    public Barcode(String id)
    {
        super(id);
    }
    
    @Override
    public String getWidgetName()
    {
        return "shieldBarcode";
    }
    
    @Override
    public BarcodeOptions getOptions()
    {
        return options;
    }
}
