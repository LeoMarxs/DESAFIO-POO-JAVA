public class Curso extends Conteudo{
    //atributos
    
    private int cargaHoraria;
    
    public Curso(){
        
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso {titulo = " + titulo + ", descricao = " + descricao + ", cargaHoraria = " + cargaHoraria + "}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria ;
    }
    

    
}