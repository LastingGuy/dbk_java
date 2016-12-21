package com.dbk.express.pojo.errorCode;

import com.dbk.express.pojo.ResponseGenerator;
import com.sun.xml.internal.ws.api.message.Packet;
import org.apache.commons.collections.map.HashedMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ben on 20/12/2016.
 */
public class dialErrCode extends baseErrCode
{
    //default
    public static dialErrCode NOT_LOGIN = new dialErrCode(Code.NotLogin);
    public static dialErrCode OK(){return new dialErrCode(Code.OK);}
    public static dialErrCode FAIL(Object body)
    {

        dialErrCode errCode = new dialErrCode(Code.Fail);
        errCode.errInfo = body;
        return  errCode;
    }

    public enum STATUS
    {
        AlreadyDial,
        SuccessToDial,
        FailToDial,
    }

    //ActionName
    private final String ActionName = "Dial";

    private List<Map> results;
    private Object errInfo;

    protected dialErrCode(Code status)
    {
        super(status);
        results = new LinkedList<Map>();
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
    public ResponseGenerator getResponseGenerator()
    {
        switch (getStatus())
        {
            case OK:
                return new ResponseGenerator(ActionName,getSuccess(),getErrCode(),getMsg(),results);
            case NotLogin:
                return new ResponseGenerator(ActionName,getSuccess(),getErrCode(),getMsg(),null);
            default:
                return new ResponseGenerator(ActionName,getSuccess(),getErrCode(),getMsg(),errInfo);
        }
    }

    public void editResult(int orderID,STATUS status,Object body)
    {
        if(getStatus()!=Code.OK)
            return;

        Map<String,Object> result = new HashedMap();
        result.put("orderID",orderID);
        result.put("success",getStatusSuccess(status));
        result.put("statusCode",getStatusCode(status));
        result.put("statusMsg",getStatusMsg(status));
        result.put("body",body);

        results.add(result);
    }

    public void editResult(int orderID,STATUS status)
    {
        editResult(orderID,status,null);
    }

    private int getStatusCode(STATUS status)
    {
        switch (status)
        {
            case SuccessToDial:
                return 41;
            case AlreadyDial:
                return 42;
            case FailToDial:
                return 43;
            default:
                return 43;
        }
    }

    private String getStatusMsg(STATUS status)
    {
        switch (status)
        {
            case SuccessToDial:
                return "success to dial";
            case AlreadyDial:
                return "Already dialed";
            case FailToDial:
                return "Fail to dial";
            default:
                return "Fail to dial";
        }
    }

    private boolean getStatusSuccess(STATUS status)
    {
        switch (status)
        {
            case SuccessToDial:
                return true;
            default:
                return false;
        }
    }



}
