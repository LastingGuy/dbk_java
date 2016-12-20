package com.dbk.express.pojo.errorCode;

import com.dbk.express.pojo.ResponseGenerator;
import com.sun.tools.classfile.StackMapTable_attribute;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Created by ben on 19/12/2016.
 */
public abstract class baseErrCode
{
    protected enum Code
    {
        //默认
        UnDefined,
        OK, //成功
        Fail, //失败
        NotLogin,    //未登录


        //登录
        SuccessToLogIn, //登录成功
        FailToLogIn, //登录失败
        PasswordIsWrong, //密码错误
        NoSuchAccount,   //无此账户

        //呼叫用户
        AlreadyDial,     //已经呼叫过此用户
        FailToDial   ,   //呼叫失败
        SuccessTODial,   //呼叫成功



    }

    //constructor
    protected baseErrCode(Code status)
    {
        this.status = status;
    }

    //keep the status info.
    private Code status = Code.UnDefined;


    protected void setStatus(Code status)
    {
        this.status = status;
    }

    protected Code getStatus()
    {
        return status;
    }


    public abstract int getErrCode();
    public abstract String getMsg();
    public abstract Boolean getSuccess();
    public abstract ResponseGenerator getResponseGenerator();

    protected int _getErrCode()
    {
        switch (status)
        {
            case OK:
                return 1;
            case Fail:
                return 0;
            case NotLogin:
                return 2;
            default:
                return -1;
        }
    }

    protected String _getMsg()
    {
        switch (status)
        {
            case OK:
                return "OK";
            case Fail:
                return "Fail";
            case NotLogin:
                return "did not log in!";
            default:
                return "UnDefined";
        }
    }

    protected Boolean _getSuccess()
    {
        switch (status)
        {
            case OK:
                return true;
            case Fail:
                return false;
            case NotLogin:
                return false;
            default:
                return false;
        }
    }


}
