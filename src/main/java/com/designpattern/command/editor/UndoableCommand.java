package com.designpattern.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
