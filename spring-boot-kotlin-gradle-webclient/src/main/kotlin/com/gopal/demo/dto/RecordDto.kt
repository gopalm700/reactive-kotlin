package com.gopal.demo.dto

import com.gopal.demo.enitities.Record

data class RecordDto(var id: Long?, val name: String, var data: String)


fun RecordDto.toEntity(): Record = Record(id = this.id, name = this.name, data = this.data)
fun Record.toDto(): RecordDto = RecordDto(id = this.id, name = this.name, data = this.data)
