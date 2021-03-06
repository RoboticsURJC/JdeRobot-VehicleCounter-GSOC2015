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
// Generated from file `ardroneextra.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public interface _ArDroneExtraOperations
{
    void toggleCam(Ice.Current __current);

    void land(Ice.Current __current);

    void takeoff(Ice.Current __current);

    void reset(Ice.Current __current);

    void recordOnUsb(boolean record, Ice.Current __current);

    void ledAnimation(int type, float duration, float req, Ice.Current __current);

    void flightAnimation(int type, float duration, Ice.Current __current);

    void flatTrim(Ice.Current __current);
}
