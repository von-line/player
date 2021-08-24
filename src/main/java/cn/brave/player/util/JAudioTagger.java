package cn.brave.player.util;

import cn.brave.player.bean.AudioMetaData;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

/**
 * @author Brave
 * @create 2021-08-23 20:24
 * @description
 **/
public class JAudioTagger {

    private AudioFileIO defaultReader = AudioFileIO.getDefaultAudioFileIO();

    /**
     * read file from file system
     * @param file audio file
     * @return Optional
     */
    public Optional<AudioFile> read(File file) {
        String filename = file.getName();
        try {
            AudioFile audioFile = null;
            if (filename.contains(".")) {
                audioFile = defaultReader.readFileMagic(file);
            } else {
                audioFile = defaultReader.readFile(file);
            }
            return Optional.ofNullable(audioFile);
        } catch (IOException | CannotReadException | ReadOnlyFileException | TagException | InvalidAudioFrameException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    /**
     * parser given audioFile object
     * @param audioFile audioFile
     * @return AudioMetaData
     */
    public AudioMetaData parse(AudioFile audioFile) {
        AudioHeader header = audioFile.getAudioHeader();
        Tag tag = audioFile.getTagOrCreateDefault();
        String artist = tag.getFirst(FieldKey.ARTIST);
        String bitRate = header.getBitRate();
        String channels = header.getChannels();
        int byteRate = header.getByteRate();
        return new AudioMetaData();
    }
}
