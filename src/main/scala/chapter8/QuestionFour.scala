package chapter8

import java.util.Date

object QuestionFour {
  class NotePlayer(val volume: Int) {
    private lazy val synth = javax.sound.midi.MidiSystem.getSynthesizer
    private lazy val channel = synth.getChannels.head

    def play(notes: Seq[Int]): Unit = {
      notes.foreach(note => {
        channel.noteOn(note, volume)
        Thread.sleep(250)
        channel.noteOff(note)
      })
    }

    def play(notesLst: List[Seq[Int]]): Unit = notesLst.foreach(notes => play(notes))
  }

  class NotePlayer2 private(val volume: Int) {
    private lazy val synth = javax.sound.midi.MidiSystem.getSynthesizer
    private lazy val channel = synth.getChannels.head

    def play(notes: Seq[Int]) = {
      notes.foreach(note => {
        channel.noteOn(note, volume)
        Thread.sleep(250)
        channel.noteOff(note)
      })
    }
  }
  
  object NotePlayer2 {
    lazy val instance = new NotePlayer2(95)
    def getInstance = instance
  }
}
