package com.dbk.express.pojo.errorCode;

import com.dbk.express.pojo.ResponseGenerator;

/**
 * Created by ben on 20/12/2016.
 */
public class dialErrCode extends baseErrCode
{
    //new error
    public static dialErrCode ALREADY_DIAL = new dialErrCode(Code.AlreadyDial);
    public static dialErrCode FAIL_TO_DIAL = new dialErrCode(Code.FailToDial);
    public static dialErrCode SUCCESS_TO_DIAL = new dialErrCode(Code.SuccessTODial);

    //default
    public static dialErrCode NOT_LOGIN = new dialErrCode(Code.NotLogin);
    public static dialErrCode OK = new dialErrCode(Code.OK);
    public static dialErrCode FAIL = new dialErrCode(Code.Fail);

    //ActionName
    private final String ActionName = "Dial";

    protected dialErrCode(Code status)
    {
        super(status);
    }

    @Override
    public int getErrCode() {
        switch (getStatus())
        {
            case SuccessTODial:
                return 41;
            case AlreadyDial:
                return 42;
            case FailToDial:
                return 40;
            default:
               return _getErrCode();
        }
    }

    @Override
    public String getMsg() {
        switch (getStatus())
        {
            case SuccessTODial:
                return "dial successfully!";
            case AlreadyDial:
                return "this person has already been dialed!";
            case FailToDial:
                return "Fail to dial";
            default:
                return _getMsg();
        }
    }

    @Override
    public Boolean getSuccess() {
        switch (getStatus())
        {
            case SuccessTODial:
                return true;
            case AlreadyDial:
                return false;
            case FailToDial:
                return false;
            default:
                return _getSuccess();
        }
    }

    @Override
    public ResponseGenerator getResponseGenerator() {
        return new ResponseGenerator(ActionName,getSuccess(),getErrCode(),getMsg(),null);
    }
}
