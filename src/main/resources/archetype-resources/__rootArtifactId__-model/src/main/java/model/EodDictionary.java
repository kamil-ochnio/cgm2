#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by ppiskorski on 2014-08-01.
 */
@Entity
@Data
public class EodDictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "EMP_SEQ", sequenceName = "SQInvoiceCreator")
    private Integer id;

    @Column(name = "idEodDictionaries", nullable = false)
    private Integer idEodDictionaries;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "rwa", nullable = true)
    private String rwa;

}
