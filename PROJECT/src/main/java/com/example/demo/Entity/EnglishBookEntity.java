package com.example.demo.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="englishbookabi")
public class EnglishBookEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="bookname")
	private String bookname;
	@Column(name="bookno")
	private int bookno;
	@Column(name="booktype")
	private String booktype;
	@Column(name="author")
	private String author;
	@Column(name="publisher")
	private String publisher;
	@Column(name="borrower")
	private String borrower;
	@Column(name="borrodate")
	private String borrodate;
	@Column(name="returndate")
	private String returndate;
    public EnglishBookEntity() 
    {
		super();
	}
	public EnglishBookEntity(int id, String bookname, int bookno, String booktype, String author, String publisher,String borrower, String borrodate, String returndate) 
	{
		super();
		this.id = id;
		this.bookname = bookname;
		this.bookno = bookno;
		this.booktype = booktype;
		this.author = author;
		this.publisher = publisher;
		this.borrower = borrower;
		this.borrodate = borrodate;
		this.returndate = returndate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getBorrodate() {
		return borrodate;
	}
	public void setBorrodate(String borrodate) {
		this.borrodate = borrodate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
    
    
}
