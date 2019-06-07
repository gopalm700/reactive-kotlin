package com.gopal.demo.service.impl

import com.gopal.demo.enitities.Record
import com.gopal.demo.repo.RecordRepo
import com.gopal.demo.service.RecordService
import org.springframework.stereotype.Service
import java.util.function.Supplier

@Service
class RecordServiceImpl(val recordRepo: RecordRepo) : RecordService {
    override fun createRecord(record: Record): Record {
        return recordRepo.save(record)
    }

    override fun deleteRecord(id: Long) {
        recordRepo.deleteById(id)
    }

    override fun getRecord(id: Long): Record {
        return recordRepo.findById(id).orElseThrow(noElementException)
    }

    override fun getRecordByName(name: String): Record {
        return recordRepo.findByName(name)?.first()?: throw NoSuchElementException()
    }
    var noElementException = Supplier {
        NoSuchElementException()
    }

}
