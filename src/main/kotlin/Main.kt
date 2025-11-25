package org.example

import org.example.homework05.Post
import org.example.homework05.WallService
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)

    println("=== Создание нового поста ===")

    print("Введите ownerId: ")
    val ownerId = scanner.nextInt()

    print("Введите fromId: ")
    val fromId = scanner.nextInt()
    scanner.nextLine() // очищаем перенос строки

    print("Введите текст поста: ")
    val text = scanner.nextLine()

    // Создание черновика поста
    val draftPost = Post(
        ownerId = ownerId,
        fromId = fromId,
        text = text
    )

    println("\nЧерновик поста: $draftPost")

    // Добавляем пост в сервис
    val createdPost = WallService.add(draftPost)

    println("\nПост успешно добавлен:")
    println(createdPost)

    // Покажем обновление поста
    println("\n=== Обновление поста ===")

    print("Введите новый текст поста: ")
    val newText = scanner.nextLine()

    val updatedPost = createdPost.copy(text = newText)
    val result = WallService.update(updatedPost)

    if (result) {
        println("\nПост успешно обновлён:")
        println(updatedPost)
    } else {
        println("Пост с id=${createdPost.id} не найден.")
    }

    println("\n=== Конец программы ===")

}