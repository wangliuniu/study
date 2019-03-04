package niit.soft.util;

import java.util.ArrayList;
import java.util.List;

import niit.soft.domain.Emp;

public class MyPagination {
	public List<Emp> list=null;  //需要分页显示的list
	private int recordCount=0;   //总的记录数
	private int pageSize=0;		 //每一页显示的记录数
	private int maxPage=0;		 //最大页码数
	
	public int getRecordCount(){   //获得总的记录数
		return recordCount;
	}
	
	public int getMaxPage(){		//获取最大页码信息
		int maxPage=(recordCount%pageSize==0?recordCount/pageSize:(recordCount/pageSize+1));
		System.out.println("maxPage="+maxPage);
		return maxPage;		
	}
//	获取当前页码
	public int getPage(String str){
		if(str==null){
			str="0";
		}
		int Page=Integer.parseInt(str);
		if(Page<1){
			Page=1;
		}else{
			if(((Page-1)*pageSize+1)>recordCount){
				Page=maxPage;
			}
		}
		return Page;
	}
	
	public List<Emp> getInitPage(List<Emp> list,int Page,int pageSize){
		List<Emp> newList=new ArrayList<Emp>();
//		初始化数据		
		this.list=list;
		this.recordCount=list.size();
		this.pageSize=pageSize;
		this.maxPage=getMaxPage();
		
		try {
			for(int i=(Page-1)*pageSize;i<=Page*pageSize-1;i++){
				if(i>=recordCount){
					break;
				}
				newList.add(list.get(i));
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return newList;
	}
	
	public List<Emp> getAppointPage(int Page){
		List<Emp> newList=new ArrayList<Emp>();
		
		try {
			for(int i=(Page-1)*pageSize;i<=Page*pageSize-1;i++){
				if(i>=recordCount){
					break;
				}
				newList.add(list.get(i));
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return newList;
		
	}
	
	public String printCtrl(int Page,String urlString){
		String strHtml="<table><tr><td>";
		strHtml=strHtml+"当前页数：["+Page+"/"+maxPage+"]&nbsp;&nbsp;";
		
		if(Page>1){
			strHtml=strHtml+"<a href='"+urlString+"?Page=1'>第一页&nbsp;&nbsp;</a>";
			strHtml=strHtml+"<a href='"+urlString+"?Page="+(Page-1)+"'>上一页&nbsp;&nbsp;</a>";
		}
		if(Page<maxPage){
			strHtml=strHtml+"<a href='"+urlString+"?Page="+(Page+1)+"'>下一页&nbsp;&nbsp;</a>";
			strHtml=strHtml+"<a href='"+urlString+"?Page="+maxPage+"'>最后一页</a>";
		}
		
		strHtml=strHtml+"</td></tr></table>";
		return strHtml;
	}

}
