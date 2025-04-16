package javaking.mid1.nested.anonymous2.test.ex1;

public class Library {
    private Book[] books;
    private int size;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if(size != books.length) {
            books[size++] = new Book(title, author);
        }else {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: "+ book.title+", 저자: " + book.author);
        }
    }

    class Book{
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

}
