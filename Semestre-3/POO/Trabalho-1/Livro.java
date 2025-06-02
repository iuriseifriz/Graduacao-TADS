public class Livro {

        //atributos
        private String titulo;
        private String autor;
        private boolean disponivel;

        public Biblioteca bib;
        public Object setTitulo;
    
        //getters and setters
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        public boolean getDisponivel() {
            return disponivel;
        }
        public void setDisponivel(boolean disponivel) {
            this.disponivel = disponivel;
        }

        //override com toString, pra não fazer mais eu retornar o endereço de memória ao invés do conteúdo da lista
        @Override
        public String toString() {
            return "Título: " + titulo + "\nAutor: " + autor + "\nDisponivel: " + disponivel;
        }
    
}
