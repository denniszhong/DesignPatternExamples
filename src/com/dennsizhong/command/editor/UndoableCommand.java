package com.dennsizhong.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
