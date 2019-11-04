package com.jplunge.springrestoauth2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jplunge.springrestoauth2.model.PianoItem;

import java.util.List;

@Repository
public class PianoDao {
	@Autowired
    JdbcTemplate jdbcTemplate;


	public List<PianoItem> findAll() {
		return jdbcTemplate.query("select * from pianos", new BeanPropertyRowMapper < PianoItem > (PianoItem.class));
	}
	
	public PianoItem findById(int id) {
		return jdbcTemplate.queryForObject("select * from pianos where pianoId=?",new Object[]{id}, new BeanPropertyRowMapper < PianoItem > (PianoItem.class));
		
	}
	
	public int add(PianoItem item){
		return jdbcTemplate.update(
	        "insert into pianos(name,text,model) VALUES (?, ?, ?)", item.getName(), item.getText(), item.getModel());
	
	}
	
	public int update(PianoItem item){
		return jdbcTemplate.update(
	        "update pianos set text=?, model=?, name=? where pianoId = ?", item.getText(),item.getModel(),item.getName(), item.getPianoId());
	
	}
	
	public int delete(PianoItem item){
		return jdbcTemplate.update(
	        "delete from pianos where pianoId = ?", item.getPianoId());
	
	}
	
}