package com.gopal.demo.repo

import com.gopal.demo.enitities.Record
import org.springframework.data.repository.CrudRepository

interface  RecordRepo : CrudRepository<Record, Long> {
    fun findByName(name: String) : List<Record>?
}
