#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import ${package}.entities.Seans;
import com.googlecode.genericdao.dao.hibernate.GenericDAO;
/**
 * Created by kamil on 28.07.14.
 */
public interface SeansDAO extends GenericDAO<Seans, Long> {

}