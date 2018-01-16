package sessiondetail

import kotlinx.cinterop.ExportObjCClass
import kotlinx.cinterop.ObjCOutlet
import kotlinx.cinterop.initBy
import platform.Foundation.NSCoder
import platform.UIKit.*

@ExportObjCClass
class SessionDetailViewController(aDecoder: NSCoder) : UIViewController(aDecoder) {

    @ObjCOutlet lateinit var titleLabel: UILabel
    @ObjCOutlet lateinit var speakerAvatarImage: UIImageView
    @ObjCOutlet lateinit var speakerNameLabel: UILabel
    @ObjCOutlet lateinit var timeLabel: UILabel
    @ObjCOutlet lateinit var placeLabel: UILabel
    @ObjCOutlet lateinit var descriptionText: UITextView

    override fun initWithCoder(aDecoder: NSCoder): UIViewController? = initBy(SessionDetailViewController(aDecoder))

    override fun viewDidLoad() {
        super.viewDidLoad()
    }
}