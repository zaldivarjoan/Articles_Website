package cs3220.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {
    //static int idSeed =1;
    private int id;
    private String title;
    private String excerpt;
    private String category;
    private LocalDateTime timeSubmitted;
    private Date datePublished;
    private String operations;
    private String content;
    private boolean dateIsTorD;
    
    
    

    public String getTimeSubmitted() {
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
    	return timeSubmitted.format(formatter);
        
    }

    public void setTimeSubmitted(LocalDateTime timeSubmitted) {
        this.timeSubmitted = timeSubmitted;
    }

    
    
//    public Data(String title, String excerpt, String category, String date, String operation, String content) {
//        this.title = title;
//       // this.id = idSeed++;
//        this.excerpt = excerpt;
//        this.category = category;
//        this.timeSubmitted = LocalDateTime.now();
//        this.datePublished = date;
//        this.operations = operation;
//        this.content = content;
//        
//    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getExcerpt() {
        return excerpt;
    }
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
//    public String getTime() {
//    	
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        return timeSubmitted.format(formatter);
//    }
//    public void setTime(LocalDateTime time) {
//        this.timeSubmitted = time;
//    }

    public Date getDatePublished() {
		return datePublished;
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm");
//    	return timeSubmitted.format(formatter);
    	
    }

    public void setDatePublished(Date timeSubmitted) {
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//    	datePublished = LocalDateTime.now().format(formatter);  
    	this.datePublished = timeSubmitted;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }
//    public static int getIdSeed() {
//        return idSeed;
//    }

//    public static void setIdSeed(int idSeed) {
//        Data.idSeed = idSeed;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDateIsTorD() {
        return dateIsTorD;
    }

    public void setDateIsTorD(boolean dateIsTorD) {
        this.dateIsTorD = dateIsTorD;
    }

	
    

}