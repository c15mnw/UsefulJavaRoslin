package com.roslin.mwicks.testutility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.utility.CsvUtil;
import com.roslin.mwicks.utility.FileUtil;
import com.roslin.mwicks.utility.Wrapper;

import java.io.File;
import java.io.InputStream;

public class DominicRannie {

	// Constants ----------------------------------------------------------------------------------
    private static final String MSGLEVEL = "*";
    private static final char CSV_SEPARATOR = ',';


	// MAIN LINE ----------------------------------------------------------------------------------
	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());
            
        	int intReturnCode = 0;

    		if (args.length != 2 ) {
    			
    		    Wrapper.printMessage("ERROR! There MUST be 2 Command Line Arguments passed to this program!", MSGLEVEL, MSGLEVEL);

    		    intReturnCode = -1;
            }
            else {
                
        		String inputFile = args[0];
        		String outputFile = args[1];
        		
                File infile = new File(inputFile);

                if ( infile.exists() ) {

                    // Format InputStream for CSV.
                    InputStream csvInput = FileUtil.readStream(infile);
                    
                    // Create CSV List
                    List<List<String>> csvList = CsvUtil.parseCsv(csvInput, CSV_SEPARATOR);

                    // Create Output List
                    List<String> sqlList = new ArrayList<String>();

                    Iterator<List<String>> iteratorRow = csvList.iterator();
                    
                 	while (iteratorRow.hasNext()) {
                		
                		List<String> row = iteratorRow.next();

                        Iterator<String> iteratorColumn = row.iterator();
                        
                        int i = 1;
                        
                        String OrderId = "";
                        //String Status = "";
                        String OrderReceivedDate = "";
                        //String Warehouse = "";
                        String AcceptedDate = "";
                        String ShippedDate = "";
                        //String CancellationDate = "";
                        //String VendorOrderNumber = "";
                        //String ShipMethod = "";
                        String ShipMethodCode = "";
                        String ShipToName = "";
                        String ShipToLine1 = "";
                        String ShipToLine2 = "";
                        String ShipToLine3 = "";
                        String ShipToCity = "";
                        String ShipToState = "";
                        String ShipToZip = "";
                        String ShipToCountry = "";
                        String ShipToPhone = "";
                        //String ShipToAttention = "";
                        //String TestOrder = "";
                        //String GiftOrder = "";
                        String Cost = "";
                        String SKUUPC = "";
                        //String ASIN = "";
                        String Title = "";
                        String QuantityOrdered = "";
                        //String QuantityShipped = "";
                        //String GiftMessage = "";
                        //String GiftWrap = "";
                        //String TrackingID = "";
                        
                     	while (iteratorColumn.hasNext()) {
                    		
                    		String column = iteratorColumn.next();
                    		
                    		if ( i == 1 ) {
                    			OrderId = column.replaceAll("\"", "");
                    		}
                    		if ( i == 2 ) {
                    			//Status = column.replaceAll("\"", "");
                    		}
                    		if ( i == 3 ) {
                    			OrderReceivedDate = column.replaceAll("\"", "");
                    		}
                    		if ( i == 4 ) {
                    			//Warehouse = column.replaceAll("\"", "");
                    		}
                    		if ( i == 5 ) {
                    			AcceptedDate = column.replaceAll("\"", "");
                    		}
                    		if ( i == 6 ) {
                    			ShippedDate = column.replaceAll("\"", "");
                    		}
                    		if ( i == 7 ) {
                    			//CancellationDate = column.replaceAll("\"", "");
                    		}
                    		if ( i == 8 ) {
                    			//VendorOrderNumber = column.replaceAll("\"", "");
                    		}
                    		if ( i == 9 ) {
                    			//ShipMethod = column.replaceAll("\"", "");
                    		}
                    		if ( i == 10 ) {
                    			ShipMethodCode = column.replaceAll("\"", "");
                    		}
                    		if ( i == 11 ) {
                    			ShipToName = column.replaceAll("\"", "");
                    		}
                    		if ( i == 12 ) {
                    			ShipToLine1 = column.replaceAll("\"", "");
                    		}
                    		if ( i == 13 ) {
                    			ShipToLine2 = column.replaceAll("\"", "");
                    		}
                    		if ( i == 14 ) {
                    			ShipToLine3 = column.replaceAll("\"", "");
                    		}
                    		if ( i == 15 ) {
                    			ShipToCity = column.replaceAll("\"", "");
                    		}
                    		if ( i == 16 ) {
                    			ShipToState = column.replaceAll("\"", "");
                    		}
                    		if ( i == 17 ) {
                    			ShipToZip = column.replaceAll("\"", "");
                    		}
                    		if ( i == 18 ) {
                    			ShipToCountry = column.replaceAll("\"", "");
                    		}
                    		if ( i == 19 ) {
                    			ShipToPhone = column.replaceAll("\"", "");
                    		}
                    		if ( i == 20 ) {
                    			//ShipToAttention = column.replaceAll("\"", "");
                    		}
                    		if ( i == 21 ) {
                    			//TestOrder = column.replaceAll("\"", "");
                    		}
                    		if ( i == 22 ) {
                    			//GiftOrder = column.replaceAll("\"", "");
                    		}
                    		if ( i == 23 ) {
                    			Cost = column.replaceAll("\"", "");
                    		}
                    		if ( i == 24 ) {
                    			SKUUPC = column.replaceAll("\"", "");
                    		}
                    		if ( i == 25 ) {
                    			//ASIN = column.replaceAll("\"", "");
                    		}
                    		if ( i == 26 ) {
                    			Title = column.replaceAll("\"", "");
                    		}
                    		if ( i == 27 ) {
                    			QuantityOrdered = column.replaceAll("\"", "");
                    		}
                    		if ( i == 28 ) {
                    			//QuantityShipped = column.replaceAll("\"", "");
                    		}
                    		if ( i == 29 ) {
                    			//GiftMessage = column.replaceAll("\"", "");
                    		}
                    		if ( i == 30 ) {
                    			//GiftWrap = column.replaceAll("\"", "");
                    		}
                    		if ( i == 31 ) {
                    			//TrackingID = column.replaceAll("\"", "");
                    		}
                    		
                    		i++;
                     	}
                     	
                     	String order_item_id = "";
                     	String product_name = "";
                     	String sku = "";
                     	String quantity_purchased = "";
                     	String currency = "";
                     	String item_price = "";
                     	String order_id = "";
                     	String sales_record_number = "";
                     	String purchase_date = "";
                     	String payments_date = "";
                     	String dispatch_date = "";
                     	String buyer_email = "";
                     	String buyer_name = "";
                     	String buyer_phone_number = "";
                     	String shipping_price = "";
                     	String shipping_method = "";
                     	String company_name = "";
                     	String recipient_name = "";
                     	String ship_address_1 = "";
                     	String ship_address_2 = "";
                     	String ship_address_3 = "";
                     	String ship_city = "";
                     	String ship_state = "";
                     	String ship_postal_code = "";
                     	String ship_country = "";
                     	String ship_phone_number = "";
                     	String status = "";
                     	String channel = "";
                     	String username = "";

                     	//ChannelGrabber = DropShip;
                     	order_item_id = OrderId;
                     	product_name = Title;
                     	sku = SKUUPC;
                     	quantity_purchased = QuantityOrdered;
                     	currency = "GBP";
                     	item_price = Cost.replaceAll("£", "");
                     	order_id = OrderId;
                     	sales_record_number = "";
                     	purchase_date = OrderReceivedDate;
                     	payments_date = AcceptedDate;
                     	dispatch_date = ShippedDate;
                     	buyer_email = "";
                     	buyer_name = "";
                     	buyer_phone_number = ShipToPhone;
                     	shipping_price = "";
                     	shipping_method = ShipMethodCode;
                     	company_name = "";
                     	recipient_name = ShipToName;
                     	ship_address_1 = ShipToLine1;
                     	ship_address_2 = ShipToLine2;
                     	ship_address_3 = ShipToLine3;
                     	ship_city = ShipToCity;
                     	ship_state = ShipToState;
                     	ship_postal_code = ShipToZip;
                     	ship_country = ShipToCountry;
                     	ship_phone_number = ShipToPhone;
                     	status = "";
                     	channel = "";
                     	username = "";

                        String Output = order_item_id + "," + product_name + "," + sku + "," + quantity_purchased + "," + currency + "," + item_price + "," + order_id + "," + sales_record_number + "," + purchase_date + "," + payments_date + "," + dispatch_date + "," + buyer_email + "," + buyer_name + "," + buyer_phone_number + "," + shipping_price + "," + shipping_method + "," + company_name + "," + recipient_name + "," + ship_address_1 + "," + ship_address_2 + "," + ship_address_3 + "," + ship_city + "," + ship_state + "," + ship_postal_code + "," + ship_country + "," + ship_phone_number + "," + status + "," + channel + "," + username;

                        sqlList.add(Output);
                 	}

                    // Output File
                    FileUtil.write(new File(outputFile), sqlList);
                    
        		    intReturnCode = 0;

                }
            }
    		
            
            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
