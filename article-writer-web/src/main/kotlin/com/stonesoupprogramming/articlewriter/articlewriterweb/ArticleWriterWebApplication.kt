package com.stonesoupprogramming.articlewriter.articlewriterweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArticleWriterWebApplication

fun main(args: Array<String>) {
    runApplication<ArticleWriterWebApplication>(*args)
}
