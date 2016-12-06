package com.dbk.express.pojo;

import org.springframework.web.filter.OncePerRequestFilter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ben on 2016/11/16.
 */
public class ResponseGenerator
{
    private String action;
    private boolean success;
    private int code;
    private String msg;;
    private Object body;


    public ResponseGenerator(String action,boolean success,int code,String msg,Object body)
    {
        this.action = action;
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.body = body;
    }

    public ResponseGenerator(String action)
    {
        this(action,false,-1,"",null);
    }

    public ResponseGenerator()
    {
        this("");
    }



    public ResponseGenerator setAction(String action)
    {
        this.action = action;
        return this;
    }
    public ResponseGenerator setSuccess(boolean success)
    {
        this.success = success;
        return this;
    }

    public ResponseGenerator setCode(int code)
    {
        this.code = code;
        return this;
    }

    public ResponseGenerator setMsg(String msg)
    {
        this.msg = msg;
        return this;
    }

    public ResponseGenerator setBody(Object body)
    {
        this.body = body;
        return this;
    }

    public String getAction()
    {
        return this.action;
    }

    public boolean getSuccess()
    {
        return this.success;
    }

    public int getCode()
    {
        return this.code;
    }

    public String getMsg()
    {
        return this.msg;
    }

    public Object getBody()
    {
        return this.body;
    }


    public Map generate()
    {
        return generate(this.action,
                this.success,
                this.code,
                this.msg,
                this.body);


    }

    public static Map generate(String action,boolean success,int code,String msg,Object body)
    {
        Map<String,Object> map = new LinkedHashMap<String,Object>();

        map.put("action",action);
        map.put("success",success);
        map.put("code",code);
        map.put("msg",msg);
        if(body==null)
            body = new HashMap<String,Object>();
        map.put("body",body);

        return map;
    }

}























