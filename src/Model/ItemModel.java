/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import SimpleItemEnterInterface.BaseContainer;

/**
 *
 * @author paradise lost
 */
public class ItemModel {
  
    Connector connector;
    Statement statement;
    
    
   public ItemModel() throws SQLException{
       
         connector = new Connector();
         statement = (Statement) connector.returnStatement();
   
   }
   
    public ArrayList<String> getItemDetailByINIT() throws SQLException
    {
    String query="SELECT * FROM `item_dim` WHERE 1 LIMIT 1\n" +
"OFFSET "+0+";";     
    ArrayList<String> list=new ArrayList<String>();
      ResultSet rs=statement.executeQuery(query);
      list.add(0,"");
      list.add(1,"");
      list.add(2,"");
      list.add(3,"");
      list.add(4,"");
      list.add(5,"");
      
     while(rs.next())
     {
   
    list.set(0,rs.getString("DESC"));
    list.set(1,rs.getString("ITEM"));
    list.set(2,rs.getString("PRICE"));
    list.set(3,rs.getString("URL"));
    list.set(4,rs.getString("STOCK"));
    list.set(5,rs.getString("ID"));
     }
     
     System.out.println(list);
     return list;
        
    }  
   
   public ArrayList<String> getItemDetailByIter(String OFFSET) throws SQLException
    {
    String query="SELECT * FROM `item_dim` WHERE 1 LIMIT 1\n" +
"OFFSET "+OFFSET+";";     
    ArrayList<String> list=new ArrayList<String>();
      ResultSet rs=statement.executeQuery(query);
      list.add(0,"");
      list.add(1,"");
      list.add(2,"");
      list.add(3,"");
      list.add(4,"");
      list.add(5,"");
      
     while(rs.next())
     {
   
    list.set(0,rs.getString("DESC"));
    list.set(1,rs.getString("ITEM"));
    list.set(2,rs.getString("PRICE"));
    list.set(3,rs.getString("URL"));
    list.set(4,rs.getString("STOCK"));
    list.set(5,rs.getString("ID"));
     }
     
     System.out.println(list);
     return list;
        
    }  

   public ArrayList<String> getItemDetailByItemNum(String ItemNum) throws SQLException
    {
    String query="SELECT * FROM `item_dim` WHERE ITEM='"+ItemNum+"';";     
    ArrayList<String> list=new ArrayList<String>();
      ResultSet rs=statement.executeQuery(query);
      list.add(0," ");
      list.add(1," ");
      list.add(2," ");
      list.add(3," ");
      list.add(4," ");
      
     while(rs.next())
     {   
    list.set(0,rs.getString("DESC"));
    list.set(1,rs.getString("ITEM"));
    list.set(2,rs.getString("PRICE"));
    list.set(3,rs.getString("URL"));
    list.set(4,rs.getString("STOCK"));
     }
     
     System.out.println(list);
     return list;
        
    }
   
   public void insertItemDim(String DESC,String ITEM,String PRICE,String URL,String STOCK) throws SQLException
   {
   String query="INSERT INTO `retail_db`.`item_dim` (`ID`, `DESC`, `PRICE`, `URL`, `STOCK`, `ITEM`,`PRICECHANGE`) VALUES (NULL,'"+DESC+"', '"+PRICE+"', '"+URL+"', '"+STOCK+"', '"+ITEM+"','0');";
   statement.executeUpdate(query);
   }
   
   public void updatePriceByItem(String ITEM,String PRICE,String PRICECHANGE) throws SQLException
   {
   String query="update  item_dim set PRICE="+PRICE+",PRICECHANGE="+PRICECHANGE+"  where ITEM='"+ITEM+"';";
   statement.executeUpdate(query);
   }
   
   public void updatePriceFlagByItem(String ITEM,String PRICECHANGE) throws SQLException
   {
   String query="update  item_dim set PRICECHANGE="+PRICECHANGE+"  where ITEM='"+ITEM+"';";
   statement.executeUpdate(query);
   }
   //deleteRecordByItem
   public void updateStockByItem(String ITEM,String STOCK) throws SQLException
   {
   String query="update  item_dim set STOCK="+STOCK+" where ITEM='"+ITEM+"';";
   statement.executeUpdate(query);
   }
   
   
   
   public void deleteRecordByItem(String ITEM) throws SQLException
   {
   String query="DELETE FROM `retail_db`.`item_dim` WHERE `item_dim`.`ITEM` = '"+ITEM+"';";
   statement.executeUpdate(query);
   }
 
 
      public Vector<Vector<String>> getAllItemDetails() throws SQLException
    { Vector<Vector<String>> resultSet=new Vector<Vector<String>>();
    String que="SELECT *\n" +
"FROM `item_dim`\n" +
"WHERE PRICECHANGE =1\n" +
"OR STOCK =0";
    ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     { 
         Vector<String> list=new Vector<String>();
         list.addElement(rs.getString("DESC"));
         list.addElement(rs.getString("ITEM"));
         list.addElement(rs.getString("PRICE"));
         list.addElement(rs.getString("URL"));
         list.addElement(rs.getString("STOCK"));
         resultSet.addElement(list);
     
     }
    
    return resultSet; 
        
    }
      
       public Vector<Vector<String>> getAllItemDetails(String val) throws SQLException
    { Vector<Vector<String>> resultSet=new Vector<Vector<String>>();
    String que="SELECT * FROM `item_dim`";
    if(val=="asc")
        que="SELECT *\n" +
"FROM `item_dim`\n" +
"WHERE 1\n" +
"ORDER BY stock ASC";
    ResultSet rs=statement.executeQuery(que);
    while(rs.next())
     { 
         Vector<String> list=new Vector<String>();
         list.addElement(rs.getString("DESC"));
         list.addElement(rs.getString("ITEM"));
         list.addElement(rs.getString("PRICE"));
         list.addElement(rs.getString("URL"));
         list.addElement(rs.getString("STOCK"));
         resultSet.addElement(list);     
     }    
    return resultSet; 
        
    
    }
  
       
         public String getTotalRows() throws SQLException
    { Vector<Vector<String>> resultSet=new Vector<Vector<String>>();
    String que="SELECT count(*) as counte\n" +
"FROM `item_dim`;";
    ResultSet rs=statement.executeQuery(que);
    String value=" ";
    while(rs.next())
     { 
        value=rs.getString("counte");
     }
    
    return value; 
        
    }
}
