import java.util.Objects;
public class Book {
        private String title;
        private Author author;
        private int publicationYear;
        public Book(String title, Author author, int publicationYear){
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }
        public String getTitle() {
            return title;
        }
        public Author getAuthor() {
            return author;
        }
        public int getPublicationYear() {
            return publicationYear;
        }
        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        public String toString(){
            return "Книга 1: " + title + "Автор: " + author.toString() + ". " + "Год публикации: " + publicationYear;
        }

        public boolean equals(Object obj){
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Book book = (Book) obj;
            return publicationYear == book.publicationYear && title.equals(book.title) && author.equals(book.author);
        }

        public int hashCode(){
            return Objects.hash(title, publicationYear, author);
        }
}
