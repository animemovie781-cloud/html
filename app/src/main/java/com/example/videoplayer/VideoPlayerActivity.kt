package com.example.videoplayer

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoPlayerActivity : AppCompatActivity() {
    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        videoView = findViewById(R.id.video_view)
        
        val videoUriString = intent.getStringExtra("video_uri")
        if (videoUriString != null) {
            val videoUri = Uri.parse(videoUriString)
            playVideo(videoUri)
        }
    }

    private fun playVideo(videoUri: Uri) {
        videoView.setVideoURI(videoUri)
        
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        
        videoView.setOnPreparedListener { mp ->
            videoView.start()
        }

        videoView.setOnErrorListener { mp, what, extra ->
            android.util.Log.e("VideoPlayer", "Error: $what, $extra")
            false
        }
    }

    override fun onPause() {
        super.onPause()
        videoView.pause()
    }

    override fun onResume() {
        super.onResume()
        if (videoView.canSeekBackward()) {
            videoView.resume()
        }
    }
}