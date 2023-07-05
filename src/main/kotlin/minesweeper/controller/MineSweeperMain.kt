package minesweeper.controller

import minesweeper.domain.MapValidator
import minesweeper.domain.MineSweeper
import minesweeper.domain.Mines
import minesweeper.view.InputView
import minesweeper.view.ResultView

fun main() {
    val rows = InputView.getCols()
    val cols = InputView.getRows()
    val mine = InputView.getMine()
    MapValidator.validate(rows, cols)
    val mines = Mines.generateMine(mine, cols, rows)
    val map = MineSweeper.getMap(mines, cols, rows)
    ResultView.start(map)
}
