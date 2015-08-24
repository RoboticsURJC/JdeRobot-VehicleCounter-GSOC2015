// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `heatmap.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public abstract class Callback_Heatmap_getHeatmapData extends Ice.TwowayCallback
{
    public abstract void response(HeatmapData __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        HeatmapPrx __proxy = (HeatmapPrx)__result.getProxy();
        HeatmapData __ret = null;
        try
        {
            __ret = __proxy.end_getHeatmapData(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}