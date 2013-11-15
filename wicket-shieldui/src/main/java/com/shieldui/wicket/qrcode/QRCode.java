package com.shieldui.wicket.qrcode;

import com.shieldui.wicket.WidgetBase;

public class QRCode extends WidgetBase
{
    private static final long serialVersionUID = 1L;

    private final QRCodeOptions options = new QRCodeOptions();
    
    // Chart class
    public QRCode(String id)
    {
        super(id);
    }
    
    @Override
    public String getWidgetName()
    {
        return "shieldQRcode";
    }
    
    @Override
    public QRCodeOptions getOptions()
    {
        return options;
    }
}
