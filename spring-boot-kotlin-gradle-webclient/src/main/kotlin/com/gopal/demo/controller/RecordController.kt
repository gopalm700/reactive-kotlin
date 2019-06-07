package com.gopal.demo.controller

import com.gopal.demo.dto.RecordDto
import com.gopal.demo.dto.toDto
import com.gopal.demo.dto.toEntity
import com.gopal.demo.enitities.Record
import com.gopal.demo.service.RecordService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
class RecordController(val recordService: RecordService) {

    @RequestMapping("/greet")
    fun greet(@RequestParam(name = "name", defaultValue = "World!") name: String): String {
        return "Hello, $name"
    }

    @PostMapping(path = ["/create"], consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun createRecord(@RequestBody recordDto: RecordDto) : RecordDto{
        return recordService.createRecord(recordDto.toEntity()).toDto()
    }

    @GetMapping("/get")
    fun getRecord(@RequestParam(name = "id", required = true) id: Long) : RecordDto{
        return recordService.getRecord(id).toDto()
    }

    @GetMapping("/get/{name}")
    fun getRecordByName(@PathVariable(name = "name") name: String) : RecordDto{
        return recordService.getRecordByName(name).toDto()
    }


    @DeleteMapping("/delete")
    fun delete(@RequestBody id: Long) =
            recordService.deleteRecord(id)
}
