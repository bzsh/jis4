package by.jrr.task.color_detector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LightColorDetector {
    public static final Logger LOGGER = LogManager.getLogger(LightColorDetector.class);
    private LightColorDetector() {
    }

    public static String detect(int waveLength) {
        LOGGER.info("detect method has been called");
        if (waveLength >= 380 && waveLength <= 449) return "Violet";
        else if (waveLength >= 450 && waveLength <= 494) return "Blue";
        else if (waveLength >= 495 && waveLength <= 569) return "Green";
        else if (waveLength >= 570 && waveLength <= 589) return "Yellow";
        else if (waveLength >= 590 && waveLength <= 619) return "Orange";
        else if (waveLength >= 620 && waveLength <= 750) return "Red";
        else return "Invisible Light";
    }
}

