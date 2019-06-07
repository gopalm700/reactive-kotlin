package com.gopal.demo.enitities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Record(@Id @GeneratedValue var id : Long? = null, var name: String, var data: String)
