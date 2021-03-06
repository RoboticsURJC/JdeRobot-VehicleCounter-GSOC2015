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
// Generated from file `pose3d.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Pose3D.
 **/
public final class Pose3DPrxHelper extends Ice.ObjectPrxHelperBase implements Pose3DPrx
{
    private static final String __getPose3DData_name = "getPose3DData";

    public Pose3DData getPose3DData()
    {
        return getPose3DData(null, false);
    }

    public Pose3DData getPose3DData(java.util.Map<String, String> __ctx)
    {
        return getPose3DData(__ctx, true);
    }

    private Pose3DData getPose3DData(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getPose3DData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getPose3DData");
                    __delBase = __getDelegate(false);
                    _Pose3DDel __del = (_Pose3DDel)__delBase;
                    return __del.getPose3DData(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getPose3DData()
    {
        return begin_getPose3DData(null, false, null);
    }

    public Ice.AsyncResult begin_getPose3DData(java.util.Map<String, String> __ctx)
    {
        return begin_getPose3DData(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getPose3DData(Ice.Callback __cb)
    {
        return begin_getPose3DData(null, false, __cb);
    }

    public Ice.AsyncResult begin_getPose3DData(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getPose3DData(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getPose3DData(Callback_Pose3D_getPose3DData __cb)
    {
        return begin_getPose3DData(null, false, __cb);
    }

    public Ice.AsyncResult begin_getPose3DData(java.util.Map<String, String> __ctx, Callback_Pose3D_getPose3DData __cb)
    {
        return begin_getPose3DData(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getPose3DData(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getPose3DData_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getPose3DData_name, __cb);
        try
        {
            __result.__prepare(__getPose3DData_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public Pose3DData end_getPose3DData(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getPose3DData_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            Pose3DDataHolder __ret = new Pose3DDataHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.__endReadParams();
            return __ret.value;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __setPose3DData_name = "setPose3DData";

    public int setPose3DData(Pose3DData data)
    {
        return setPose3DData(data, null, false);
    }

    public int setPose3DData(Pose3DData data, java.util.Map<String, String> __ctx)
    {
        return setPose3DData(data, __ctx, true);
    }

    private int setPose3DData(Pose3DData data, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "setPose3DData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("setPose3DData");
                    __delBase = __getDelegate(false);
                    _Pose3DDel __del = (_Pose3DDel)__delBase;
                    return __del.setPose3DData(data, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_setPose3DData(Pose3DData data)
    {
        return begin_setPose3DData(data, null, false, null);
    }

    public Ice.AsyncResult begin_setPose3DData(Pose3DData data, java.util.Map<String, String> __ctx)
    {
        return begin_setPose3DData(data, __ctx, true, null);
    }

    public Ice.AsyncResult begin_setPose3DData(Pose3DData data, Ice.Callback __cb)
    {
        return begin_setPose3DData(data, null, false, __cb);
    }

    public Ice.AsyncResult begin_setPose3DData(Pose3DData data, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setPose3DData(data, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_setPose3DData(Pose3DData data, Callback_Pose3D_setPose3DData __cb)
    {
        return begin_setPose3DData(data, null, false, __cb);
    }

    public Ice.AsyncResult begin_setPose3DData(Pose3DData data, java.util.Map<String, String> __ctx, Callback_Pose3D_setPose3DData __cb)
    {
        return begin_setPose3DData(data, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setPose3DData(Pose3DData data, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setPose3DData_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setPose3DData_name, __cb);
        try
        {
            __result.__prepare(__setPose3DData_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeObject(data);
            __os.writePendingObjects();
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_setPose3DData(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __setPose3DData_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static Pose3DPrx checkedCast(Ice.ObjectPrx __obj)
    {
        Pose3DPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof Pose3DPrx)
            {
                __d = (Pose3DPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    Pose3DPrxHelper __h = new Pose3DPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static Pose3DPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        Pose3DPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof Pose3DPrx)
            {
                __d = (Pose3DPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    Pose3DPrxHelper __h = new Pose3DPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static Pose3DPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        Pose3DPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    Pose3DPrxHelper __h = new Pose3DPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static Pose3DPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        Pose3DPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    Pose3DPrxHelper __h = new Pose3DPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static Pose3DPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        Pose3DPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof Pose3DPrx)
            {
                __d = (Pose3DPrx)__obj;
            }
            else
            {
                Pose3DPrxHelper __h = new Pose3DPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static Pose3DPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        Pose3DPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            Pose3DPrxHelper __h = new Pose3DPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::Pose3D"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _Pose3DDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _Pose3DDelD();
    }

    public static void __write(IceInternal.BasicStream __os, Pose3DPrx v)
    {
        __os.writeProxy(v);
    }

    public static Pose3DPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            Pose3DPrxHelper result = new Pose3DPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
