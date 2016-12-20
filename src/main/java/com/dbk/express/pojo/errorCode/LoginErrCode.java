package com.dbk.express.pojo.errorCode;

import com.dbk.express.pojo.ResponseGenerator;

/**
 * Created by ben on 19/12/2016.
 */
public class LoginErrCode extends baseErrCode
{

    public static LoginErrCode PASSWORD_IS_WRONG = new LoginErrCode(Code.PasswordIsWrong);
    public static LoginErrCode NO_SUCH_ACCOUNT = new LoginErrCode(Code.NoSuchAccount);
    public static LoginErrCode SUCCESS_TO_LOGIN = new LoginErrCode(Code.SuccessToLogIn);
    public static LoginErrCode FAIL_TO_LOGIN = new LoginErrCode(Code.FailToLogIn);
    public static LoginErrCode OK = new LoginErrCode(Code.OK);
    public static LoginErrCode FAIL = new LoginErrCode(Code.Fail);


    private final String ActionName = "Login";

    private LoginErrCode(Code status)
    {
        super(status);
    }

    @Override
    public int getErrCode()
    {
        switch (getStatus())
        {
            case SuccessToLogIn:
                return 11;
            case FailToLogIn:
                return 10;
            case PasswordIsWrong:
                return 12;
            case NoSuchAccount:
                return 13;
            default:
                return super._getErrCode();
        }
    }

    @Override
    public String getMsg()
    {
        switch (getStatus())
        {
            case SuccessToLogIn:
                return "Success To Log in!";
            case FailToLogIn:
                return "Fail To Log in!";
            case PasswordIsWrong:
                return "Password is Wrong!";
            case NoSuchAccount:
                return "No such account!";
            default:
                return super._getMsg();
        }
    }

    @Override
    public Boolean getSuccess()
    {
        switch (getStatus())
        {
            case SuccessToLogIn:
                return true;
            case FailToLogIn:
                return false;
            case PasswordIsWrong:
                return false;
            case NoSuchAccount:
                return false;
            default:
                return super._getSuccess();
        }
    }

    @Override
    public ResponseGenerator getResponseGenerator()
    {
        return new ResponseGenerator(ActionName,getSuccess(),getErrCode(),getMsg(),null);
    }

}
