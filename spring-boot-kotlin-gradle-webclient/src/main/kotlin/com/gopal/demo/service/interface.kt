package com.gopal.demo.service

import com.gopal.demo.enitities.Record

interface RecordService {

    fun createRecord(record : Record) : Record
    fun deleteRecord(id: Long)
    fun getRecord(id: Long) : Record
    fun getRecordByName(name: String): Record

}
