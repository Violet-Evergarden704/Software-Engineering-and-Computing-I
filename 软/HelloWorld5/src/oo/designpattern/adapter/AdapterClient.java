package oo.designpattern.adapter;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

 interface LogDbOpeApi {
    /*
     * 新增日志
     * @param 需要新增的日志对象
     */
    public void createLog(LogBean logbean);
}


/*
 * 适配器对象，将记录日志到文件的功能适配成数据库功能
 */
 class LogAdapter implements LogDbOpeApi{
    private LogFileOperateApi adaptee;
    public LogAdapter(LogFileOperateApi adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void createLog(LogBean logbean) {
        List<LogBean> list = adaptee.readLogFile();
        list.add(logbean);
        adaptee.writeLogFile(list);
    }
}



/*
 * 读取日志文件，从文件里面获取存储的日志列表对象
 * @return 存储的日志列表对象
 */
 interface LogFileOperateApi {
    public List<LogBean> readLogFile();
    /**
     * 写日志文件，把日志列表写出到日志文件中去
     * @param list 要写到日志文件的日志列表
     */
    public void writeLogFile(List<LogBean> list);
}

/*
 * 日志数据对象
 */
 class LogBean {
    private String logId;//日志编号
    private String opeUserId;//操作人员

    public String getLogId(){
        return logId;
    }
    public void setLogId(String logId){
        this.logId = logId;
    }

    public String getOpeUserId(){
        return opeUserId;
    }
    public void setOpeUserId(String opeUserId){
        this.opeUserId = opeUserId;
    }
    public String toString(){
        return "logId="+logId+",opeUserId="+opeUserId;
    }
}



/*
 * 实现对日志文件的操作
 */
 class LogFileOperate implements LogFileOperateApi{
    /*
     * 设置日志文件的路径和文件名称
     */
    private String logFileName = "file.log";
    /*
     * 构造方法，传入文件的路径和名称
     */
    public LogFileOperate(String logFilename){
        if(logFilename!=null){
            this.logFileName = logFilename;
        }
    }

    @Override
    public List<LogBean> readLogFile() {
        List<LogBean> list = null;
        ObjectInputStream oin =null;

        //业务代码,这里写的桩代码，创建了一个长度为1的List<oo.designpattern.adapter.LogBean>对象，返回了
        LogBean logbean = new LogBean();
        logbean.setLogId("2");
        logbean.setOpeUserId("jordan");
        list = new ArrayList<LogBean>();
        list.add(logbean);
        return list;
    }

    @Override
    public void writeLogFile(List<LogBean> list) {

        File file = new File(logFileName);
        ObjectOutputStream oout = null;

        //业务代码,这里直接打印输入list的size，代表写日志到文件中去。
        System.out.println(list.size());
    }

}
public class AdapterClient {

    public static void main(String[] args){
        LogBean logbean = new LogBean();
        logbean.setLogId("1");
        logbean.setOpeUserId("michael");

        LogFileOperateApi logFileApi = new LogFileOperate("");
        //创建操作日志的接口对象
        LogDbOpeApi api = new LogAdapter(logFileApi);
        api.createLog(logbean);
    }
}