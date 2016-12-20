package com.dbk.express.pojo.errorCode;

import com.dbk.express.pojo.ResponseGenerator;

/**
 * Created by ben on 20/12/2016.
 */
public class errCode extends baseErrCode
{
    public static errCode OK = new errCode(Code.OK);
    public static errCode FAIL = new errCode(Code.Fail);
    public static errCode NOT_LOGIN = new errCode(Code.NotLogin);

    protected errCode(Code status)
    {
        super(status);
    }

    @Override
    public int getErrCode() {
        return _getErrCode();
    }

    @Override
    public String getMsg() {
        return _getMsg();
    }

    @Override
    public Boolean getSuccess() {
        return _getSuccess();
    }

    @Override
    public ResponseGenerator getResponseGenerator() {
        return new ResponseGenerator("Base",getSuccess(),getErrCode(),getMsg(),null);
    }

    public ResponseGenerator getResponseGenerator(String actionName)
    {
        return getResponseGenerator().setAction(actionName);
    }
}
