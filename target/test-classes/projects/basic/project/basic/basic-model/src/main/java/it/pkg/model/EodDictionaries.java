package it.pkg.model;

import lombok.Data;
import javax.persistence.*;
/**
 * Created by ppiskorski on 2014-07-31.
 */
@Entity
@Data
public class EodDictionaries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "EMP_SEQ", sequenceName = "SQInvoiceCreator")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "rwaFlag", nullable = false)
    private Integer rwaFlag;

}