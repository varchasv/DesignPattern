package lms;

import java.util.Date;

// since library can have multiple copies of same book barcode distinguishes it
public class BookItem extends Book{
    String barcode;
    Date publishedAt;
    Rack rackLocation;
    BookStatus bookStatus;
}
