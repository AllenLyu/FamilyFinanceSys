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
            XQPreparedExpression exp = conn  
            		.prepareExpression("for $finance in doc('"+userid+".xml')" +
                    		"/Finances/Finance return string($finance)");
            XQResultSequence result = exp.executeQuery();
            while (result.next()) {  
                String rs=result.getItemAsString(null).trim();
                String[] r=rs.split("\n");
                for(int i=0;i<r.length;i++){
                	String str=new String(r[i]);
                	r[i]=str.replaceAll("\\s*","");
                }
                Finance finance=new Finance(Integer.parseInt(r[0]),
                		Integer.parseInt(r[1]),r[2],r[3],r[4],r[5],
                		Integer.parseInt(r[6]));
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
			String userid,String financetype,String type,String keyword){
        List<Finance> list=new ArrayList<Finance>();
        XQDataSource ds = new SaxonXQDataSource();  
        try {  
            XQConnection conn = ds.getConnection();  
            //根据条件查询信息
            XQPreparedExpression exp = null;
            if(financetype==""){
            	if(type==""){
            		if(keyword==""){//EEE
            			exp = conn  
                		.prepareExpression("for $finance in doc('"+userid+".xml')" +
                        		"/Finances/Finance return string($finance)");
            		}else if(keyword!=""){//EEI
            			exp = conn  
                        .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                        		"where contains(string($finance/remark),'"+keyword+"')"+
                        		"return string($finance)");
            		}
            	}else if(type!=""){
            		if(keyword==""){//EIE
            			exp = conn  
                        .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                        		"where $finance/type='"+type+"'"+
                        		"return string($finance)");
            		}else if(keyword!=""){//EII
            			exp = conn  
                        .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                        		"where $finance/type='"+type+
                        		"' and contains(string($finance/remark),'"+keyword+"')"+
                        		"return string($finance)");
            		}
            	}
            }else if(financetype!=""){
            	if(type==""){
            		if(keyword==""){//IEE
            			exp = conn  
                        .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                        		"where $finance/financetype='"+financetype+"'"+
                        		"return string($finance)");
            		}else if(keyword!=""){//IEI
            			exp = conn  
                        .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                        		"where $finance/financetype='"+financetype+
                        		"' and contains(string($finance/remark),'"+keyword+"')"+
                        		"return string($finance)");
            		}
            	}else if(type!=""){
            		if(keyword==""){//IIE
            			exp = conn  
                        .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                        		"where $finance/financetype='"+financetype+
                        		"' and $finance/type='"+type+
                        		"' return string($finance)");
            		}else if(keyword!=""){//III
            			exp = conn  
                        .prepareExpression("for $finance in doc('"+userid+".xml')/Finances/Finance " +
                        		"where $finance/financetype='"+financetype
                        		+"' and $finance/type='"+type
                        		+"' and contains(string($finance/remark),'"+keyword+"')"+
                        		"return string($finance)");
            		}
            	}
            }
            XQResultSequence result = exp.executeQuery();
            while (result.next()) {  
                String rs=result.getItemAsString(null).trim();
                String[] r=rs.split("\n");
                for(int i=0;i<r.length;i++){
                	String str=new String(r[i]);
                	r[i]=str.replaceAll("\\s*","");
                }
                Finance finance=new Finance(Integer.parseInt(r[0]),
                		Integer.parseInt(r[1]),r[2],r[3],r[4],r[5],
                		Integer.parseInt(r[6]));
                list.add(finance);
             }  
        } catch (XQException e) {  
            e.printStackTrace();  
        }  
		return list;
	}
}
