package DOM;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQItem;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

import net.sf.saxon.xqj.SaxonXQDataSource;

public class XQJ4Search {
	
	//main.frame 显示全部信息 函数
	public static List<Finance> xqj4All(String userid){
		XQDataSource ds = new SaxonXQDataSource();
		List<Finance> list=new ArrayList<Finance>();
        try {  
            XQConnection conn = ds.getConnection();  
            //查询全部信息
            XQPreparedExpression exp_id = conn  
            		.prepareExpression("for $finance in doc('"+userid+".xml')" +
                    		"/Finances/Finance return data($finance/id)");
            XQPreparedExpression exp_num = conn  
    				.prepareExpression("for $finance in doc('"+userid+".xml')" +
            				"/Finances/Finance return data($finance/num)");
            XQPreparedExpression exp_financetype = conn  
    		.prepareExpression("for $finance in doc('"+userid+".xml')" +
            		"/Finances/Finance return data($finance/financetype)");
            XQPreparedExpression exp_type = conn  
    		.prepareExpression("for $finance in doc('"+userid+".xml')" +
            		"/Finances/Finance return data($finance/type)");
            XQPreparedExpression exp_spendingtime = conn  
    		.prepareExpression("for $finance in doc('"+userid+".xml')" +
            		"/Finances/Finance return data($finance/spendingtime)");
            XQPreparedExpression exp_remark = conn  
    		.prepareExpression("for $finance in doc('"+userid+".xml')" +
            		"/Finances/Finance return data($finance/remark)");
            XQPreparedExpression exp_userid = conn  
    		.prepareExpression("for $finance in doc('"+userid+".xml')" +
            		"/Finances/Finance return data($finance/userid)");
            XQResultSequence result_id = exp_id.executeQuery();
            XQResultSequence result_num = exp_num.executeQuery();
            XQResultSequence result_financetype = exp_financetype.executeQuery();
            XQResultSequence result_type = exp_type.executeQuery();
            XQResultSequence result_spendingtime = exp_spendingtime.executeQuery();
            XQResultSequence result_remark = exp_remark.executeQuery();
            XQResultSequence result_userid = exp_userid.executeQuery();
            while (result_id.next()) {  
            	result_num.next();
            	result_financetype.next();
            	result_type.next();
            	result_spendingtime.next();
            	result_remark.next();
            	result_userid.next();
                int id = Integer.parseInt(result_id.getItemAsString(null).trim());
                int num= Integer.parseInt(result_num.getItemAsString(null).trim());
                String financetype=result_financetype.getItemAsString(null).trim();
                String type=result_type.getItemAsString(null).trim();
                String spendingtime=result_spendingtime.getItemAsString(null).trim();
                String remark=result_remark.getItemAsString(null).trim();
                int usrid = Integer.parseInt(result_userid.getItemAsString(null).trim());
                Finance finance=new Finance();
                finance.setId(id);
                finance.setNum(num);
                finance.setFinancetype(financetype);
                finance.setType(type);
                finance.setSpendingtime(spendingtime);
                finance.setRemark(remark);
                finance.setUserid(usrid);
                list.add(finance);
             }  
        } catch (XQException e) {  
            // TODO: handle exception  
            e.printStackTrace();  
        }
		return list;
	}
	
	//main.frame  按照financetype,type,keyword搜索信息 函数
	public static List<Finance> xqj4Selected(
			String userid,String financetype,String type,String keyWord){
        List<Finance> list=new ArrayList<Finance>();
        XQDataSource ds = new SaxonXQDataSource();  
        try {  
            XQConnection conn = ds.getConnection();  
            //根据条件查询信息
            XQPreparedExpression exp_id = conn  
                    .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                    		"where $finance/financetype:="+financetype
                    		+"and $finance/type:="+type
                    		+"and contains($finance/remark,'keyword')"+
                    		"return data($finance/id)");  
            XQPreparedExpression exp_num = conn  
            .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
            		"where $finance/financetype:="+financetype
            		+"and $finance/type:="+type
            		+"and contains($finance/remark,'keyword')"+
            		"returndata($finance/num)");
            XQPreparedExpression exp_financetype = conn  
            .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
            		"where $finance/financetype:="+financetype
            		+"and $finance/type:="+type
            		+"and contains($finance/remark,'keyword')"+
            		"return data($finance/financetype)");
            XQPreparedExpression exp_type = conn  
            .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
            		"where $finance/financetype:="+financetype
            		+"and $finance/type:="+type
            		+"and contains($finance/remark,'keyword')"+
            		"return data($finance/type)");
            XQPreparedExpression exp_spendingtime = conn  
            .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
            		"where $finance/financetype:="+financetype
            		+"and $finance/type:="+type
            		+"and contains($finance/remark,'keyword')"+
            		"return data($finance/spendingtime)");
            XQPreparedExpression exp_remark = conn  
            .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
            		"where $finance/financetype:="+financetype
            		+"and $finance/type:="+type
            		+"and contains($finance/remark,'keyword')"+
            		"return data($finance/remark)");
            XQPreparedExpression exp_userid = conn  
            .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
            		"where $finance/financetype:="+financetype
            		+"and $finance/type:="+type
            		+"and contains($finance/remark,'keyword')"+
            		"return data($finance/userid)");
            XQResultSequence result_id = exp_id.executeQuery();
            XQResultSequence result_num = exp_num.executeQuery();
            XQResultSequence result_financetype = exp_financetype.executeQuery();
            XQResultSequence result_type = exp_type.executeQuery();
            XQResultSequence result_spendingtime = exp_spendingtime.executeQuery();
            XQResultSequence result_remark = exp_remark.executeQuery();
            XQResultSequence result_userid = exp_userid.executeQuery();
            while (result_id.next()) {  
            	result_num.next();
            	result_financetype.next();
            	result_type.next();
            	result_spendingtime.next();
            	result_remark.next();
            	result_userid.next();
                int id = Integer.parseInt(result_id.getItemAsString(null).trim());
                int num= Integer.parseInt(result_num.getItemAsString(null).trim());
                String Financetype=result_financetype.getItemAsString(null).trim();
                String Type=result_type.getItemAsString(null).trim();
                String spendingtime=result_spendingtime.getItemAsString(null).trim();
                String remark=result_remark.getItemAsString(null).trim();
                int usrid = Integer.parseInt(result_userid.getItemAsString(null).trim());
                Finance finance=new Finance();
                finance.setId(id);
                finance.setNum(num);
                finance.setFinancetype(Financetype);
                finance.setType(Type);
                finance.setSpendingtime(spendingtime);
                finance.setRemark(remark);
                finance.setUserid(usrid);
                list.add(finance);
             }  
        } catch (XQException e) {  
            e.printStackTrace();  
        }  
		return list;
	}
}
