package model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author USER Master
 */
public class Tarefa {
    
    private String titulo;
    private String descricao;
    private int id;
    private LocalTime horaInicio, horaFim;
    private LocalDate dataTarefa;
    private String status;
    

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the horaInicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }
    
    public void setHoraInicio(LocalTime horaInicio){
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public LocalTime getHoraFim() {
        return horaFim;
    }
    
    public void setHoraFim(LocalTime horaFim){
        this.horaFim = horaFim;
    }
    
    public LocalDate getDataTarefa(){
     return dataTarefa;   
    }
    
    public void setDataTarefa(LocalDate dataTarefa){
    this.dataTarefa = dataTarefa;
    }
    public String getStatus() {
    return status;
    }
    public void setStatus (String status){
    this.status = status;
    }
    
}
