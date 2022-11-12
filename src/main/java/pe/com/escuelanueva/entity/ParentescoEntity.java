package pe.com.escuelanueva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="ParentescoEntity")
@Table(name="parentesco")
public class ParentescoEntity {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codpar")
    private long codigo;
    @Column(name="despar")
    private String descripcion;
    @Column(name="estpar")
    private boolean estado;
 
}
