package com.shieldui.wicket.qrcode;

import com.shieldui.wicket.WidgetComponentBase;

public class QRCode extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;

    private final QRCodeOptions options = new QRCodeOptions();
    
    public QRCode(String id)
    {
        super(id, "QRcode");
    }
    
    @Override
    public QRCodeOptions getOptions()
    {
        return options;
    }
}
