#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import ${package}.entities.Seans;

/**
 * Created by kamil on 28.07.14.
 */
public class SeansDAOImpl extends GenericDAOImpl<Seans, Long> implements SeansDAO {
}
