package com.example.ejemplo.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;
//SI LODE IMPORT TE APARECEN EN GRIS ES Q NO SE ESTAN
//USANDO Y POR ENDE LOS PUEDO BORRAR


@Entity//Convierte la clase en una entidad orientada a objetos
@Table
@Getter @Setter //son DECORATORS Y SIRVEN PARA CREAR
// UN PUENTE DIRECTO ENTRE LA CLASE O LA PROPIEDAD
// (EJ CLASE STUDENT),
// Y LA HERRAMIENTA EN CUESTION (para que la clase en java student
//se transforme en una clase en MYSQL
// por lo tanto student sera una entidad o clase, una tabla
//y tb se le generan automaticamente los getters y setters
public class Student {

    @Id
    @GeneratedValue //autoincremental
    private Long id;//los arroba ese asocian a ESTO, A LO Q SIGUE ABAJO INMEDIATAMENTE SOLAMENTE
    private String name;
    private String lastname;
}
